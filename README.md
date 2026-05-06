# sonar-svc-auth-forge

`sonar-svc-auth-forge` explores backend services with a small Kotlin codebase and local fixtures. The technical goal is to design a Kotlin verification harness for auth systems, covering resource planning, capacity fixtures, and failure-oriented tests.

## Use Case

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Sonar Svc Auth Forge Review Notes

For a quick review, compare `queue pressure` with `queue pressure` before reading the middle cases.

## Highlights

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/sonar-svc-auth-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Code Layout

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `queue pressure`, `retry load`, `worker slack`, and `session drift`.

The Kotlin code keeps the review rule close to the tests.

## Run The Check

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Regression Path

The check exercises the source code and the review fixture. `stale` is the high score at 263; `baseline` is the low score at 71.

## Future Work

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
