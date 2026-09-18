class HashTable:
    def __init__(self):
        self.collection = {}

    def hash(self, string: str):
        return sum(ord(char) for char in string)

    def add(self, key: str, value):
        hashed_key = self.hash(key)
        if hashed_key not in self.collection:
            self.collection[hashed_key] = {}
        self.collection[hashed_key][key] = value

    def remove(self, key: str):
        hashed_key = self.hash(key)
        bucket = self.collection.get(hashed_key, {})
        if key in bucket:
            del bucket[key]
            if not bucket:
                del self.collection[hashed_key]

    def lookup(self, key: str):
        hashed_key = self.hash(key)
        return self.collection.get(hashed_key, {}).get(key)