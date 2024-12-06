import re
from pprint import pprint

# Чтение данных из файла
with open("any.json") as f:
    data = f.read()

# Функция для парсинга JSON с использованием регулярных выражений
def parse_json(json_str):
    # Убираем все лишние пробелы и символы новой строки с помощью регулярных выражений
    json_str = re.sub(r'\s+', ' ', json_str)  # Заменяем все пробелы и новые строки на один пробел
    json_str = re.sub(r'\s*([\{\}\[\]:,])\s*', r'\1', json_str)  # Убираем пробелы вокруг скобок, запятой и двоеточия

    def parse_value(index):
        char = json_str[index]

        if char == '{':
            return parse_object(index)
        elif char == '[':
            return parse_array(index)
        elif char == '"':
            return parse_string(index)
        elif char.isdigit() or char == '-':
            return parse_number(index)
        elif json_str.startswith('true', index):
            return True, index + 4
        elif json_str.startswith('false', index):
            return False, index + 5
        elif json_str.startswith('null', index):
            return None, index + 4
        else:
            raise ValueError(f"Unexpected character at index {index}: {char}")

    def parse_object(index):
        obj = {}
        index += 1

        while json_str[index] != '}':
            key, index = parse_string(index)
            index += 1  # Пропускаем ':'
            value, index = parse_value(index)
            obj[key] = value

            if json_str[index] == ',':
                index += 1

        return obj, index + 1

    def parse_array(index):
        array = []
        index += 1

        while json_str[index] != ']':
            value, index = parse_value(index)
            array.append(value)

            if json_str[index] == ',':
                index += 1

        return array, index + 1

    def parse_string(index):
        index += 1  # Пропускаем открывающую кавычку
        start = index

        while json_str[index] != '"':  # Ищем закрывающую кавычку
            index += 1

        return json_str[start:index], index + 1

    def parse_number(index):
        start = index

        while index < len(json_str) and (json_str[index].isdigit() or json_str[index] in '.-'):
            index += 1

        return float(json_str[start:index]) if '.' in json_str[start:index] else int(json_str[start:index]), index

    result, _ = parse_value(0)
    return result

# Функция для конвертации в YAML
def dict_to_yaml(data, indent=0):
    yaml_output = ""
    for key, value in data.items():
        key = key.strip("'").strip('"')
        if isinstance(value, dict):
            yaml_output += " " * indent + f"{key}:\n"
            yaml_output += dict_to_yaml(value, indent + 2)
        elif isinstance(value, list):
            yaml_output += " " * indent + f"{key}:\n"
            for item in value:
                if isinstance(item, dict):
                    yaml_output += " " * (indent + 2) + "- "
                    yaml_output += dict_to_yaml(item, indent + 4)
                else:
                    yaml_output += " " * (indent + 2) + f"- {item}\n"
        else:
            value = str(value).strip("'").strip('"')
            yaml_output += " " * indent + f"{key}: {value}\n"
    return yaml_output


# Чтение и парсинг JSON с регулярными выражениями
data = "".join(data)
parsed_data = parse_json(data)

# Конвертация в YAML
yaml_result = dict_to_yaml(parsed_data)
while "- " in yaml_result:
    yaml_result = yaml_result.replace("- ", "-")
yaml_result = yaml_result.replace("-", "- ")
# Выводим результат
print(yaml_result)

# Запись в файл
with open("ans3.YAML", "w") as yaml_file:
    yaml_file.write(yaml_result)
