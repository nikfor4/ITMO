import re
import json
import yaml


with open('any.json', 'r') as f:
    data = f.read()

data = re.sub(r'\s+', ' ', data)
data = re.sub(r'\s*([\{\}\[\]:,])\s*', r'\1', data)


data = json.loads(data)

with open('ans2.YAML', 'w', encoding='utf-8') as yaml_file:
    yaml.dump(data,yaml_file,)
