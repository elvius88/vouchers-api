FROM core.harbor.work.py.igrupobbva/runes/base-api:0.1.0

LABEL "py.com.jaha.api.vouchers-api.version"=1.2.3

RUN mkdir -p /usr/local/vouchers-api
ADD vouchers-api-1.2.3.jar /usr/local/vouchers-api/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
