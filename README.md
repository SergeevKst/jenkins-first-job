# jenkins-first-job
![Jenkins](https://img.shields.io/badge/-jenkins-0a0a0a?style=for-the-badge&logo=jenkins)
![Spring Boot](https://img.shields.io/badge/-springboot-0a0a0a?style=for-the-badge&logo=springboot)
<br/>
> Memo for connecting with Jenkins on Ubuntu

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Status](#status)
* [Inspiration](#inspiration)

## General info

# 1. Set up
> sudo install jenkins

# 2. Write in credentials
### The first start should be with initialAdmin
> cat /Users/username/.jenkins/secrets/initialAdminPassword

# 3. Set up plugins
#### Check _"Install suggested plugins"_

# 4. Global Jenkins configure
<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/setup_jdk.png?raw=true" width="900">
<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/setup_maven.png?raw=true" width="900">

# 5. Create job для Jenkins
<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/create_job.png?raw=true" width="900">

# 6. Job options
## 6.1. General
<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/github_credential.png?raw=true" width="900">

## 6.2. Build Trigger
<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/setup_trigger.png?raw=true" width="900">

### 7. Start ngrok 
####(Because webhook can't work with localhost)
> ./ngrok http 8080

<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/ngrok.png?raw=true" width="900">

### 8. Add Webhook on Github
<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/github_webhook.png?raw=true" width="900">

## 9. TomCat
<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/setup_tomcat.png?raw=true" width="900">

### 10. Success result
<img src="https://github.com/SergeevKst/jenkins-first-job/blob/master/assets/deploy_success.png?raw=true" width="900">

## Technologies
* Java - version 11
* Spring Boot - version 2.7.10
* Jenkins
* Ubuntu

