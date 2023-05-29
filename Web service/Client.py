import requests
data = {
    'a':10,
    'b':20}
response = requests.post('http://localhost:5000/add',json=data)

result = response.json()
print(result['result'])

