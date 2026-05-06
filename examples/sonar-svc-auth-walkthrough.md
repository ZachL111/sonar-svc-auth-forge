# Sonar Svc Auth Forge Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 71 | hold |
| stress | retry load | 229 | ship |
| edge | worker slack | 248 | ship |
| recovery | session drift | 199 | ship |
| stale | queue pressure | 263 | ship |

Start with `stale` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `queue pressure` against `queue pressure`, not the raw score alone.
