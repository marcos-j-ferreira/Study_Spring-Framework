
URL_BASE=http://localhost:8081/api/v1/estudo/

#simples hello
#curl $URL_BASE/hello

#requisição com simples/ param
#curl $URL_BASE/hello/MARCOS


#  ==== requisições com qeury ====

#curl $URL_BASE/somar?a=2&b=30

#curl $URL_BASE/saudar?nome=Ana

#curl $URL_BASE/filter?tag=java&tag=spring&tag=mysql

#echo "requisição com múltiplos parâmetros sem aspas: "
#curl $URL_BASE/filter?tag=java&tag=spring&tag=mysql
#ele só volta java

#  essas duas requisições funcionou corretamento.em baixo:

#echo "requisição com múltiplos parâmetros com aspas: "
#curl "$URL_BASE/filter?tag=java&tag=spring&tag=mysql"

#echo "requisição com múltiplos parâmetros codificado por causa dos parâmetro: "
#curl -G "$URL_BASE/filter" --data-urlencode "tag=java" --data-urlencode "tag=spring" --data-urlencode "tag=mysql"

echo "requisição com body"
#curl -X POST $URL_BASE -d "nome=ler&descricao=ler três páginas"

echo " "
curl -X POST $URL_BASE -H "Content-Type: application/json" -d '{"nome": "Prova", "descricao": "Estudar para lógica matemática"}'
#echo " "

#curl -X POST $URL_BASE/teste -H "Content-Type: application/json" -d '{"nome": "Atividade", "descricao": "Atividade Ramon"}'
