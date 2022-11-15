# Getting Started

### Prerequisites 
```
java 17
redis-cli
```

1. Run Redis container 
```bash
docker-compose up -d
```
2. Run the app
```bash
./gradlew bootRun
```
3. Connect to redis via redis-cli
```bash
redis-cli -h localhost -p 6379
```
4. Create a key to evict event
```bash
SET test value
```

At this point you will get an event as 
```bash
Redis pubsub event received: test
```