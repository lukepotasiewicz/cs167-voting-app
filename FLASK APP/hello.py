import csv

from flask import Flask, escape, request

app = Flask(__name__)


@app.route('/')
def hello():
    return "hi"


@app.route('/vote')
def vote():
    # Write to csv file
    with open('votes.csv', 'a', newline='') as f:
        candidate = request.args.get('candidate')
        csv.writer(f).writerow([candidate])
    return "voted for " + candidate

#env FLASK_APP=hello.py flask run