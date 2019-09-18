# Microservice Deploy

This is a sandbox project dedicated to experiment with CI/CD tools and other DevOps solutions.

The app is a simple RESTful webservice built with [Groovy](https://groovy-lang.org/) and [Micronaut](https://micronaut.io/).

## Continuous integration

### GitHub Actions
[![GitHub Actions Badge](https://github.com/esuau/microservice-deploy/workflows/Build%20and%20publish/badge.svg)](https://github.com/esuau/microservice-deploy)

The workflow file is located at [`.github/workflows/build.yml`](https://github.com/esuau/microservice-deploy/blob/master/.github/workflows/build.yml). 

### CircleCI
[![CircleCI](https://circleci.com/gh/esuau/microservice-deploy.svg?style=svg)](https://circleci.com/gh/esuau/microservice-deploy)

The build configuration is located at [`.circleci/config.yml`](https://github.com/esuau/microservice-deploy/blob/master/.circleci/config.yml).

### Travis CI
[![Build Status](https://travis-ci.org/esuau/microservice-deploy.svg?branch=master)](https://travis-ci.org/esuau/microservice-deploy)

The build configuration file is located at [`.travis.yml`](https://github.com/esuau/microservice-deploy/blob/master/.travis.yml).

## Deployments

### Heroku

The deployed service is available at [`https://microservice-deploy.herokuapp.com/status`](https://microservice-deploy.herokuapp.com/status).

### Azure

The deployed Azure Web App is available at [`https://microservice-deploy.azurewebsites.net/status`](https://microservice-deploy.azurewebsites.net/status).
