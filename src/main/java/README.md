Requirements:

Services/publishers can publish messages to topics
Subscribers can read and process messages in a pull-based fashion
API to create topics, publisher to write messages into them and subscribers to subscribe, consume and unsubscribe
Maintain state of consumption of each message in each topic for each subscriber
Maintain order of message consumption from a topic for each subscriber

Run:
Use the demo class and verify if the messages are consumed by each subscription ID in order from both publishers.