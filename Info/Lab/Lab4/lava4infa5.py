import csv
import json
from pprint import pprint

with open("any.json") as f:
    data = f.read()


def parse_json(json_str):
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


# Функция для конвертации в CSV
def dict_to_csv(data, filename="output.csv"):
    with open(filename, mode="w", newline='') as file:
        writer = csv.writer(file)

        if isinstance(data, list):
            headers = data[0].keys()
            writer.writerow(headers)

            for item in data:
                writer.writerow(item.values())
        elif isinstance(data, dict):
            writer.writerow(data.keys())
            writer.writerow(data.values())


parsed_data = parse_json(data)

if isinstance(parsed_data, list):
    dict_to_csv(parsed_data)

elif isinstance(parsed_data, dict):
    dict_to_csv([parsed_data])
