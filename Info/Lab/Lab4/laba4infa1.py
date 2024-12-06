import yaml
import json

# Чтение JSON файла
with open('any.json', 'r') as f:
    data = json.load(f)

# Запись данных в YAML файл с использованием нового API
with open('ans1.YAML', 'w', encoding='utf-8') as yaml_file:
    yaml.dump(data,yaml_file)
