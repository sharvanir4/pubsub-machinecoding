Requirements:

- Cache (key-value) that supports get, put, delete, with eviction
- extensible code

Service class -> singleton, supports api to interact with cache
support multiple eviction (LRU, LFU) -> strategy (LRU default)

cache creation: with capacity

thread safe