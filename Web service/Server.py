from flask import Flask, jsonify, request

# create an app object
app = Flask(__name__)
# create the route to the function
@app.route('/add', methods=['POST'])

def add():
    data = request.get_json()
    a = data['a']
    b = data['b']
    result = a+b
    answer = jsonify({'result':result})
    return answer

# run the app
if __name__ == '__main__':
    app.run()
