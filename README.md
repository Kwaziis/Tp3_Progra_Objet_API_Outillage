# Tp3_Progra_Objet_API_Outillage

#Etape 5: explication des différentes dépendances importées:

#Spring web:
contient un client HTTP et permet la mise en place d'une application web
#Spring data:
sert à failiter la relation avec les base de données et les serveurs physiques
#H2:
une base de données rapide qui permet de creer une base integree ou sur support physique
#Springboot dev tools:
des outils pour assister le développeur
#Thymeleaf: 
implanter Thymeleaf qui est utile pour créer une appli web
 
#Etape 13: questions sur le contrôleur

#Question 1)
 @GetMapping("/greeting") permet de définir l'url de la page
#Question 2)
@RequestParam(name="name", required=false, defaultValue="World") String nameGET, Model model, model etant le package dans lequel est stocké notre html
#Question 3)
model.addAttribute("nomTemplate", nameGET); permet d'ajouter l'attribut au modèle en récupérant grace à nameGET la valeur a entrer
