FROM ubuntu:xenial

RUN apt-get update && \
    apt-get install -yqq net-tools bridge-utils iproute2 iptables arptables tcpdump

#RUN sysctl -w net.ipv4.ip_forward=1 && \
#    iptables -A FORWARD -i eth0 -o eth1 -j ACCEPT && \
#    iptables -A FORWARD -i eth1 -o eth0 -j ACCEPT 

COPY run.sh run.sh

ENTRYPOINT ["/run.sh"]
