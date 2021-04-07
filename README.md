# dizzei
This is a dizzy project

Tutorial
1. Create a Spring boot Project 
![image](https://user-images.githubusercontent.com/19800645/111548634-c3198200-8759-11eb-8e1f-a7f7dac64204.png)
![image](https://user-images.githubusercontent.com/19800645/111549040-53f05d80-875a-11eb-860f-0044e5d2232c.png)
![image](https://user-images.githubusercontent.com/19800645/111549273-a762ab80-875a-11eb-9aa0-f1365e5d8808.png)
![image](https://user-images.githubusercontent.com/19800645/111549579-2e178880-875b-11eb-812a-cb1d42ae116e.png)
![image](https://user-images.githubusercontent.com/19800645/111549658-52736500-875b-11eb-92b8-7b8db2d9fad8.png)
![image](https://user-images.githubusercontent.com/19800645/111549743-7d5db900-875b-11eb-8405-be0c95a4d62b.png)
![image](https://user-images.githubusercontent.com/19800645/111549823-a0886880-875b-11eb-8138-57424853e682.png)
![image](https://user-images.githubusercontent.com/19800645/111552849-f19b5b00-8761-11eb-9a5f-6d691a265905.png)
![image](https://user-images.githubusercontent.com/19800645/111553537-60c57f00-8763-11eb-9b2c-de15f87c9825.png)

2. Create a docker file
![image](https://user-images.githubusercontent.com/19800645/111715665-14497480-8833-11eb-89ce-ffae5c5a835a.png)
![image](https://user-images.githubusercontent.com/19800645/111715911-ab163100-8833-11eb-972c-53db8505818d.png)
![image](https://user-images.githubusercontent.com/19800645/111715964-c719d280-8833-11eb-94a3-8b4aa3fd897c.png)

3. Create a local image of docker

docker build -t dizzy

docker build -t dizzy .

docker images

![image](https://user-images.githubusercontent.com/19800645/111716007-e153b080-8833-11eb-98af-ea93bdd83056.png)
![image](https://user-images.githubusercontent.com/19800645/111716065-0516f680-8834-11eb-8384-6c4237ce2d6e.png)
![image](https://user-images.githubusercontent.com/19800645/111716129-25df4c00-8834-11eb-9203-e3e6d9335c7f.png)
![image](https://user-images.githubusercontent.com/19800645/111850825-102f5c80-88f0-11eb-8f8d-d9768547376f.png)
![image](https://user-images.githubusercontent.com/19800645/111850862-3228df00-88f0-11eb-8c8c-4dd3b9195bc9.png)
![image](https://user-images.githubusercontent.com/19800645/111850978-7f0cb580-88f0-11eb-867f-769ed265bd36.png)

4. Push image to the docker hub

docker tag dizzy gabrieu3/dizzy

docker push gabrieu3/dizzy

docker images

![image](https://user-images.githubusercontent.com/19800645/111851208-2984d880-88f1-11eb-93cc-aff36c4ab000.png)
![image](https://user-images.githubusercontent.com/19800645/111851323-82ed0780-88f1-11eb-830e-592591274271.png)

5. Pull image to the docker hub

docker rmi dizzy gabrieu3/dizzy_3

docker images

docker run -p 8080:8080 gabrieu3/dizzy_3

docker images

![image](https://user-images.githubusercontent.com/19800645/111851434-e1b28100-88f1-11eb-95c7-d76354e6a5bf.png)
![image](https://user-images.githubusercontent.com/19800645/111851474-0c043e80-88f2-11eb-9023-ce755a15fa00.png)
![image](https://user-images.githubusercontent.com/19800645/111851513-37872900-88f2-11eb-87ce-f8e8c2b8902b.png)
![image](https://user-images.githubusercontent.com/19800645/111851622-ae242680-88f2-11eb-89d6-3715d48b757b.png)



6. Run project using imagem of dockerhub
![image](https://user-images.githubusercontent.com/19800645/111853364-78cf0700-88f9-11eb-99e7-5a76f8655158.png)
![image](https://user-images.githubusercontent.com/19800645/111851849-a0bb6c00-88f3-11eb-94ec-2c0e7c3c452c.png)
![image](https://user-images.githubusercontent.com/19800645/111853372-82f10580-88f9-11eb-9828-84aeb06e7185.png)

7. AWS
![image](https://user-images.githubusercontent.com/19800645/113795290-e4e7a280-9722-11eb-93d5-e56865056da2.png)
![image](https://user-images.githubusercontent.com/19800645/113795332-fd57bd00-9722-11eb-915e-149b84cd7fa9.png)
![image](https://user-images.githubusercontent.com/19800645/113795368-1496aa80-9723-11eb-84d5-37f150a2d55c.png)
![image](https://user-images.githubusercontent.com/19800645/113795429-427bef00-9723-11eb-9972-d5bad36ee533.png)
![image](https://user-images.githubusercontent.com/19800645/113795468-5fb0bd80-9723-11eb-84d0-74fb37d76ef3.png)
![image](https://user-images.githubusercontent.com/19800645/113795511-79ea9b80-9723-11eb-90d6-65bd5e227f3a.png)
![image](https://user-images.githubusercontent.com/19800645/113795632-bddda080-9723-11eb-82a0-95ef2d7839fd.png)
![image](https://user-images.githubusercontent.com/19800645/113795696-db126f00-9723-11eb-92b7-f69ee53465da.png)
![image](https://user-images.githubusercontent.com/19800645/113795756-fd0bf180-9723-11eb-842f-d28e6b326219.png)

AWS Server
sudo -i
sudo yum update -y
sudo yum install docker
sudo service docker start
docker -v
docker pull gabrieu3/dizzy_3:tagname
docker run -p 80:8080
docker run -p 80:8080 --name spring-boot-docker gabrieu3/dizzy_3
![image](https://user-images.githubusercontent.com/19800645/113796426-98ea2d00-9725-11eb-92fb-ba511f61e077.png)
![image](https://user-images.githubusercontent.com/19800645/113796772-67be2c80-9726-11eb-81ec-66afe6bb0bf7.png)
![image](https://user-images.githubusercontent.com/19800645/113797337-70633280-9727-11eb-97f2-0bee1be8a17c.png)
![image](https://user-images.githubusercontent.com/19800645/113797846-6e4da380-9728-11eb-9430-5e6600a3143a.png)












