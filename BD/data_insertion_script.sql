-- -----------------------------------------------------
-- Schema awiki
-- -----------------------------------------------------
USE `awiki`;


-- -----------------------------------------------------
-- Table `awiki`.`listings`
-- -----------------------------------------------------
INSERT INTO `listings` (`idlistings`, `nombre`, `descripcion`, `rating`, `categoria`, `direccion`, `estado`, `municipio`, `codigo_postal`, `colonia`)
	VALUES 
    (1, "Museo Intereactivo de Economía (MIDE)", "Museo contemporáneo con exhibiciones sobre economía, finanzas y desarrollo sustentable.", 4.6, "museo", "Tacuba 17", "Ciudad de México", "Cuauhtémoc", 44150 , "Americana"),
    (2, "York Pub", "York Pub debuta en la Colonia Americana de Guadalajara, Jalisco en el año 2012 como un verdadero y original pub inglés, inspirado en la cultura británica y su gran afición por el trago, la buena cerveza, ricos platillos y la convivencia en grupo.", 4.8, "bar", "Chapultepec Sur 179", "Jalisco", "Guadalajara", 44150 , "Americana"),
	(3, "Museo Maya de Cancún y Zona Arqueológica de San Miguelito", "Museo con una colección importante de artefactos arqueológicos mayas en un ambiente diseñado elegantemente.", 4.5, "museo", "Kukulcan km 16.5 S/N", "Quintana Roo", "Cancún", 77500, "Zona Hotelera"),
	(4, "Museo Casa Carranza", "Sitio único en México, con una amplia variedad de especias endémicas y un ecosistema valioso para la investigación científica y el turismo.", 4.0, "museo", "Venustiano Carranza 2050", "San Luis Potosí", "San Luis Potosí", 78200, "Del Valle"),
	(5, "Hotel RIU Santa Fe", "El Hotel Riu Santa Fé (Todo Incluido 24 horas) está situado en el corazón de una de las zonas más populares de Los Cabos para los turistas, en una ubicación privilegiada en una playa de arena blanca y agua turquesa.", 4.5, "hotel", "Camino Viejo a San Jose S/N", "Baja California Sur", "Cabo San Lucas", 23453, "Zona Hotelera");

-- -----------------------------------------------------
-- Table `awiki`.`usuarios`
-- -----------------------------------------------------
INSERT INTO `usuarios` (`idusuarios`, `nombre`, `email`, `nombre_usuario`, `contraseña`, `imagen_perfil`, `descripcion_perfil`, `es_perfil_empresa`)
	VALUES
    (1, "Angel Martinez", "martinezaa@gmail.com", "Angel Martinez", "Martinez34", "imagenPerfil.jpg", "Hola soy Angel, tengo 20 años y me encanta viajar por todo México", 0),
    (2, "Ana Gabriel", "gabrielMA22@hotmail.com", "Ana Gabriel", "Bombon556", "imagenPerfil.jpg", "Hola soy Ana María, tengo 39 años y me encanta conocer lugares nuevos, hacer nuevos amigos y vivir experiencias enriquecedoras", 0),
    (3, "Ernesto Godoy", "ernestoo.godoy78@gmail.com", "Ernesto Godoy", "MarquesaMexico1", "imagenPerfil.jpg", "Mi nombre es Ernesto, apasionado viajero que busca hacer nuevos amigos en todo México", 0),
    (4, "Elizabeth Tapia", "elizabethtg45@yahoo.es", "Elizabeth Tapia", "CorazonMagico45", "imagenPerfil.jpg", "Soy Elizabeth, y ando en busca de nuevos lugares para poder disfrutar junto con mi familia", 0),
    (5, "Miguel Hernandez", "miguelHer334@gmail.com", "Miguel Hernandez", "2025Miguel", "imagenPerfil.jpg", "Mi nombre es Miguel, en busca de nuevas experiencias y nuevos amigos sobre el camino ;)", 0);

-- -----------------------------------------------------
-- Table `awiki`.`imagenes`
-- -----------------------------------------------------
INSERT INTO `imagenes` (`idimagenes`, `url`)
	VALUES
    (1, "https://www.mexicoescultura.com/galerias/espacios/principal/mide_museo.jpg"),
    (2, "https://yorkpub.com.mx/img/ambiente/foto4.jpg"),
    (3, "https://a.travel-assets.com/findyours-php/viewfinder/images/res70/260000/260778-Maya-Cancun-Museum.jpg"),
    (4, "https://sanluis.eluniversal.com.mx/resizer/v2/RNU2OD3XJNHUDLSE6LDEIB4KNU.jpg?auth=a02a6ffa736d7344a2998b8f2e7d75cdf74713279aefa5e350ddcd5a126860e1"),
    (5, "https://cdn-bunny.menteurbana.mx/wp-content/uploads/2016/08/1in2D78N-e24nKE6I-Destacada-9.jpg");

-- -----------------------------------------------------
-- Table `awiki`.`resenas`
-- -----------------------------------------------------
INSERT INTO `resenas` (`idresenas`, `descripcion`, `calificacion`)
	VALUES
	(1, "Es un museo muy interesante e interactivo. Ideal para grupos escolares y niños pequeños", 4.5),
	(2, "El restaurante York tiene muy buena iluminación y se siente familiar. La comida y la atención es muy buena", 5.0),
	(3, "Hotel RIU siempre con muchas atracciones y cosas por hacer. En temporada vacacional hay mucha gente", 3.5),
	(4, "Moshi Moshi es de los mejores restaurantes de Monterrey", 4.4),
	(5, "El museo del desierto está lleno de dinosaurio y mucho que ver. De los mejores museos a los que he ido.", 5.0);

-- -----------------------------------------------------
-- Table `awiki`.`publicaciones`
-- -----------------------------------------------------
INSERT INTO publicaciones (idpublicaciones, descripcion, imagen)
	VALUES
	(1, "El dia de hoy estuve en el Museo de la Ballena y no podía esperar por compartirles fotos", "https://lineadirectaportal.com/wp-content/uploads/2024/06/Museo-Nacional-de-la-Ballena-Munba-5.jpg.webp"),
	(2, "Por el cumpleaños de mi jefe fuimos a comer al Porfirios", "https://media-cdn.tripadvisor.com/media/photo-s/1a/e4/f3/d8/interior-porfirios-puebla.jpg"),
	(3, "En el museo del desierto con la familia", "https://turisteandomonterrey.com/wp-content/uploads/2022/02/Tour-Monterrey-Museo-del-Desierto-Saltillo-1.jpg"),
	(4, "Viernes en el York Pub", "https://yorkpub.com.mx/img/ambiente/foto5.jpg"),
	(5, "El museo de la luz está super divertido", "https://culturayucatanac.com.mx/wp-content/uploads/2024/05/04-El-museo-de-la-luz-presenta-Color-el-conocimiento-de-lo-invisible.jpg");