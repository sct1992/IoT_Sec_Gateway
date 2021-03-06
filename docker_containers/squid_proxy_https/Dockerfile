FROM ubuntu:xenial

RUN apt-get update && \
    apt-get install -yqq apache2-utils ethtool openssl wget gcc g++ make perl-modules && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/* && \
    mkdir -p /etc/squid && \
    touch /etc/squid/passwords

RUN mkdir squid_src && cd squid_src && \
    wget http://www.squid-cache.org/Versions/v3/3.5/squid-3.5.28.tar.gz && \
    tar xzvf squid-3.5.28.tar.gz && cd squid-3.5.28 && \
    ./configure --prefix=/usr \
    --localstatedir=/var \
    --libexecdir=${prefix}/lib/squid \
    --datadir=${prefix}/share/squid \
    --sysconfdir=/etc/squid \
    --with-default-user=proxy \
    --with-logdir=/var/log/squid \
    --with-pidfile=/var/run/squid.pid \
    --enable-inline \
    --disable-arch-native \
    --enable-ssl \
    --enable-ssl-crtd \
    --with-default-user=proxy \
    --with-openssl \
    && make && make install

COPY squid.conf /etc/squid/squid.conf

COPY run.sh update_password.sh remove_password.sh add_password.sh /

EXPOSE 13128/tcp

CMD ["squid", "-NYCd", "1"]

ENTRYPOINT ["/run.sh"] 