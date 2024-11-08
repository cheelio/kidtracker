FROM node:16.15.0
MAINTAINER Sergey Shadchin (sergei.shadchin@gmail.com)

RUN apt update && apt install default-jre default-jdk maven npm -y

RUN mkdir -p /build
ADD build.sh /usr/local/bin/build.sh

RUN chmod u+x /usr/local/bin/build.sh
USER node
WORKDIR /build

CMD build.sh