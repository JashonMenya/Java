# The Mystical World of Hashing Algorithms 🧙‍♂️🎉

At a high level, a **hashing algorithm** is a magical potion that transforms an input (or 'message') into a fixed-size string of bytes, usually a digest that looks quite random. The output, commonly known as the hash value or hash code, is unique to the given input. Ideally, even a tiny change in the input concocts a massive change in output, making the new hash appear uncorrelated with the old one.

## Cryptographic Hashes 🧙‍♂️🔐

Cryptographic hash functions are like mystical spells that provide particular security properties. Here are a few well-known algorithms in this category:

- **[MD5](https://en.wikipedia.org/wiki/MD5)**: The Magical Digest 5, which was once widely used, is now considered weak due to discovered vulnerabilities.
- **[SHA-1](https://en.wikipedia.org/wiki/SHA-1)**: The Secure Hexing Algorithm 1, which also fell from grace due to collision attacks.

- **[SHA-256 & SHA-3](https://en.wikipedia.org/wiki/SHA-3)**: Robust members of the Secure Hexing Algorithm family, known for their strength and wide usage in various security protocols and systems.

## Non-Cryptographic Hashes 🚀📊

Non-cryptographic hash functions aren’t used for their security properties, but for organizing and processing data. Let's take a glance at some of these interesting functions:

- **CRC32**: The Cyclic Redundancy Check, often employed to detect accidental changes to raw data.
- **MurmurHash**: A non-cryptographic hash function suitable for general hash-based lookup.
- **CityHash**: Crafted by the sorcerers at Google, it's optimized for hashing short strings.

## Checksums 🕵️‍♂️🧪

Checksums are like little magic inspectors ensuring data integrity during transmission:

- **CRC**: Reappearing here, it’s utilized in network communications and file storage for error-checking.

- **Adler-32**: Used in zlib's realm, it's mainly employed for integrity checks.

## HMACs 🗝️🔒

HMACs (Hash-Based Message Authentication Codes) combine cryptographic hash functions and secret keys to ensure both integrity and authenticity:

- **HMAC-SHA256**: Often used to validate information in web tokens like JWTs, utilizing the mightiness of SHA-256.

Our mystical journey through hash functions pauses here. Whether it's securing secret messages or organizing vast data treasure troves, these algorithms prove to be formidable tools in the arsenal of both wizards and engineers! 📜🔐

---

## Key Characteristics and Uses of Hashing Algorithms

### Characteristics

- **Deterministic**: The same input will always produce the same output.
- **Fixed Output Length**: Regardless of the input size, the output (hash) has a fixed length.
- **Efficiency**: Computing the hash value should be relatively fast.
- **Pre-Image Resistance**: Given a hash, it should be computationally infeasible to find the original input.
- **Small Changes in Input Produce Large Changes in Output**: A minor alteration to the input should result in a drastically different output.
- **Collision Resistance**: It should be computationally difficult to find two different inputs that produce the same hash output.

Feel free to add your tales, details, or debunk myths about any of these fascinating hashes during your enthralling journey into the world of hash functions! 🎉📜🧪
