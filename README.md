# CensoDemografico
Pesquisa com 1000 pessoas para coleta de dados.(Gênero,idade e altura)
##  ALGORITMO DO EXERCICIO
###  início
	enquanto i<=999 faça
		faça
		ler menu (0)fem,(1)masc,(2)outros,(3 ou mais)invalido.
		se menu==2
		c = c+1		
		enquanto menu >=3
		se menu==1
			ler idade(idMasc) 
			id1 = id1+1
			masc = masc+1
			ler se idade >=18 && <=35
			entre = entre+1
		se nao
			ler idade(idGrupo)
			id2 = id2+1
			ler se idade >=18 && <=35
			entre = entre+1
		se menu==0
			ler altura(altFem)
			alt1 = alt1+altFem
			fem = fem+1
		se não
			ler altura(altGrupo)
			grupo = grupo+altGrupo
	fim enquanto
	
	calcular media da idade do grupo(medIdG) id1+id2/1000
	exibir media da idade do grupo
	
	calcular media da idade dos homens(medIdH) id1/masc
	exibir medIdH
	
	calcular media da altura das mulheres(medAltF)alt1/fem
	exibir medAltF
	
	exibir quantidades de pessoas que se identificaram como outros(c)
	
	calcular percentual de pessaos entre 18 e 35 (perc) perc = entre*0,1
	exibir perc
fim	 

![Fluxograma](https://user-images.githubusercontent.com/64235507/168479934-539d91c4-1325-4372-9bdc-14c7c32bdfa7.png)
