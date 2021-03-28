# java-kafka
Kafka Producer Consumer Example
**Start Zookeeper**
***-bin/kafka-server-start.bat config/server.properties***

**Start Kafka Server**
bin/kafka-server-start.bat config/server.properties

**Create Kafka Topic**
bin/kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka_Example

**Publish to the Kafka Topic via Console**
bin/kafka-console-producer.bat --broker-list localhost:9092 --topic kafka_Example

**Consume from the Kafka Topic via Console**
bin/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning
