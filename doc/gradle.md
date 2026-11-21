# Custom gradle parameters

You can use these parameters by specifying them inside the `gradle.properties` file as 
`systemProp.<name>=<value>` or passing them through the CLI with `-D<name>=<value>`.

## packageSuffix
This allows you to specify a suffix, which will be added on release builds to the application id, 
the `app_name` string and the apk file.  
No validation is made, so make sure to pass in a valid value.

## skipFormatKtlint
This allows you to skip the `formatKtLint` task.  
No value is needed.   
It is used for CI in order to check for badly formatted files.

## releaseCertSha256

When building a release APK for Rillvoro's GitHub Releases page, pass
`-DreleaseCertSha256=<SHA-256 fingerprint of the release signing certificate>`.
The GitHub Actions release build reads the same fingerprint from the
`RELEASE_CERT_SHA256` repository variable. Colons in the fingerprint are
optional. The in-app update checker is available
to matching release builds using the standard application ID. A GitHub release
must have a stable `vMAJOR.MINOR.PATCH` or `MAJOR.MINOR.PATCH` tag and an APK
asset to trigger an update notification.
