# jetty-app
A simple jetty hello world app for maven distZip package work.

The pom file includes the (unpublished) distZip plugin (source code found here - https://github.com/aripka-pivotal/distZip-maven-plugin) this plugin will need to be added to youy maven repo as described in it's repo

**Build Instructions**
`>mvn clean package`
This will build the application and then create a Gradle distZip packaging that is compatible with the Cloud Foundry Buildpack.
  - See Java build pack documentation - https://github.com/cloudfoundry/java-buildpack/blob/master/docs/container-dist_zip.md
  - See gradle application plugin for details about distZip  https://docs.gradle.org/current/userguide/application_plugin.html

**Deploy to Cloud Foundry**
This application currently contains a manifest you only need to supply a name (optional host if different than name)
cf push <<app_name>>

