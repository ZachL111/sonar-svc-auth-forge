# Review Journal

The cases below are the review handles I would use before changing the implementation.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 71, lane `hold`
- `stress`: `retry load`, score 229, lane `ship`
- `edge`: `worker slack`, score 248, lane `ship`
- `recovery`: `session drift`, score 199, lane `ship`
- `stale`: `queue pressure`, score 263, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
