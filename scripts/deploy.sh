#!/bin/bash

docker build
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker push majortwip/escapeconnect