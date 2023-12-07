# Hashing Algorithms Explained 🧙‍♂️✨

A **hashing algorithm** magically turns an input (or 'message') into a fixed-size string of bytes, typically creating a seemingly random digest. The resulting hash value or hash code is distinct for varied inputs. Notably, even a minuscule input change triggers a significant output transformation, causing the new hash to bear no apparent relation to the previous one.
## Cryptographic Hashes 🔐

Cryptographic hash functions, crafted for security, include:

- **[MD5](https://en.wikipedia.org/wiki/MD5)**: Once popular, now considered vulnerable.
- **[SHA-1](https://en.wikipedia.org/wiki/SHA-1)**: Previously robust, now deemed unsafe.
- **[SHA-256 & SHA-3](https://en.wikipedia.org/wiki/SHA-3)**: Currently strong and widely utilized.

## Non-Cryptographic Hashes 📊

Used for organizing and processing data:

- **CRC32**: Detects accidental data alterations.
- **MurmurHash**: Suited for general hash-based lookup.
- **CityHash**: Google’s tool, optimal for hashing short strings.

## Checksums 🛡️

Ensure data integrity during transfer:

- **CRC**: Widely employed for error-checking in communications and storage.
- **Adler-32**: Mainly used in zlib for integrity checks.

## HMACs 🗝️

Combining hash functions and secret keys for integrity and authenticity:

- **HMAC-SHA256**: Commonly validates web tokens like JWTs.

Feel free to delve deeper into each hashing algorithm to unveil their mysteries and capabilities! 🔍📘
