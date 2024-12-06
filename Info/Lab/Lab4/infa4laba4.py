import time
import re
from pprint import pprint

with open("any.json") as f:
    data = f.read()


def parse_json_no_regex(json_str):
    json_str = json_str.replace('\n', '').replace('\t', '').replace(' ', '')

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
        index += 1
        start = index

        while json_str[index] != '"':
            index += 1

        return json_str[start:index], index + 1

    def parse_number(index):
        start = index

        while index < len(json_str) and (json_str[index].isdigit() or json_str[index] in '.-'):
            index += 1

        return float(json_str[start:index]) if '.' in json_str[start:index] else int(json_str[start:index]), index

    result, _ = parse_value(0)
    return result


def parse_json_with_regex(json_str):
    json_str = re.sub(r'\s+', ' ', json_str)
    json_str = re.sub(r'\s*([\{\}\[\]:,])\s*', r'\1', json_str)

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
            pass

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
        index += 1
        start = index

        while json_str[index] != '"':
            index += 1

        return json_str[start:index], index + 1

    def parse_number(index):
        start = index

        while index < len(json_str) and (json_str[index].isdigit() or json_str[index] in '.-'):
            index += 1

        return float(json_str[start:index]) if '.' in json_str[start:index] else int(json_str[start:index]), index

    result, _ = parse_value(0)
    return result


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


def measure_time(func, data, iterations=10000):
    start_time = time.time()
    for _ in range(iterations):
        parsed_data = func(data)
        yaml_result = dict_to_yaml(parsed_data)
    end_time = time.time()
    return end_time - start_time


time_no_regex = measure_time(parse_json_no_regex, data)
time_with_regex = measure_time(parse_json_with_regex, data)

# Выводим результаты
print(f"без регулярок: {time_no_regex} сек")
print(f"с регулярками: {time_with_regex} сек")
