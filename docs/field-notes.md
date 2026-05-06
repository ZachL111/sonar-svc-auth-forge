# Field Notes

The useful part of this repository is the small rule set around queue pressure and worker slack.

The domain cases cover `queue pressure`, `retry load`, `worker slack`, and `session drift`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`stale` tells me the happy path still works. `baseline` tells me whether the guardrail still has teeth.

The extra check gives the repository a behavior path that can fail for a domain reason, not only a syntax reason.
