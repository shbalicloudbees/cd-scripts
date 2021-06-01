FROM ubuntu:16.04




RUN apt-get update -y && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends \
    sshpass \
     && apt-get install -y curl less vim wget netbase ansible


COPY CloudBeesFlowAgent-x64-10.1.1.148196 /tmp/CloudBeesFlowAgent-x64-10.1.1.148196
#COPY install-letsencrypt-in-jdk.sh /tmp/install-letsencrypt-in-jdk.sh

# install the agent in silent mode
RUN chmod +x /tmp/CloudBeesFlowAgent-x64-10.1.1.148196 \
    && /tmp/CloudBeesFlowAgent-x64-10.1.1.148196 --mode silent \
    && mkdir -p /opt/electriccloud/data \
   # && /tmp/install-letsencrypt-in-jdk.sh 
    && rm -f /tmp/CloudBeesFlowAgent-x64-10.1.1.148196 
   # && rm -f /tmp/install-letsencrypt-in-jdk.sh

ENV COMMANDER_HOME=/opt/cloudbees/sda
ENV COMMANDER_DATA=/opt/electriccloud/data
ENV PATH=$COMMANDER_HOME/bin:$PATH
ENV LD_LIBRARY_PATH=$COMMANDER_HOME/lib

WORKDIR /work