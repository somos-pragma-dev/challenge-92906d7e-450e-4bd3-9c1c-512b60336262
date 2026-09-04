# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Desarrollar una API REST empresarial con Spring Boot 3 para la gestión de productos y pedidos en un e-commerce. El sistema debe incluir: arquitectura en capas con controladores REST, servicios de negocio y repositorios JPA; modelado de datos con entidades Product, Order y Customer usando relaciones OneToMany y ManyToMany con Hibernate; autenticación y autorización basada en JWT con Spring Security, incluyendo roles de ADMIN y USER con acceso diferenciado por endpoint; documentación automática con OpenAPI 3.0 y Swagger UI accesible en /api-docs; manejo centralizado de errores con @ControllerAdvice y respuestas estandarizadas en formato JSON; validación de entradas con Bean Validation usando @Valid, @NotNull y @Size; paginación y ordenamiento de resultados en los endpoints de listado usando Pageable; pruebas unitarias con JUnit 5 y Mockito cubriendo la capa de servicio al menos al 80%; pruebas de integración con @SpringBootTest verificando los flujos principales; y containerización con Docker usando Dockerfile multi-stage optimizado para producción. El desarrollador debe implementar el módulo completo desde la capa de persistencia hasta los controladores REST, aplicando principios SOLID y clean code en cada capa.

### Reto
- Tema: Spring Boot Enterprise Architecture
- Seniority: junior-l3
- Tipo: practical
- Título: Desarrollo de API REST para e-commerce con Spring Boot
- Tiempo estimado: 40 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Arquitectura y modelado de datos — objetivo: Definir la arquitectura en capas y modelar las entidades del dominio. — entregable (NO resolver): Diagrama de arquitectura y entidades modeladas con relaciones y restricciones de validación.
- Fase 2: Autenticación y autorización — objetivo: Implementar la autenticación y autorización basada en JWT. — entregable (NO resolver): Configuración de autenticación y autorización con JWT y roles definidos.
- Fase 3: Documentación y manejo de errores — objetivo: Generar documentación automática y manejar errores de manera centralizada. — entregable (NO resolver): Documentación generada automáticamente y manejo centralizado de errores.
- Fase 4: Validación de entradas y paginación — objetivo: Validar las entradas y paginar los resultados. — entregable (NO resolver): Validación de entradas y paginación de resultados implementadas.
- Fase 5: Pruebas y containerización — objetivo: Realizar pruebas unitarias e de integración y containerizar el sistema. — entregable (NO resolver): Pruebas unitarias e de integración realizadas y sistema containerizado.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
src/main/java/com/ecommerce/controller/ProductController.java
package com.ecommerce.controller;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<Page<ProductDTO>> getAllProducts(Pageable pageable) {
        return ResponseEntity.ok(productService.getAllProducts(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@Valid @RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(productService.createProduct(productDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long id, @Valid @RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(productService.updateProduct(id, productDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}

// === ARCHIVO: src/main/java/com/ecommerce/service/ProductService.java ===
package com.ecommerce.service;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<ProductDTO> getAllProducts(Pageable pageable) {
        Page<Product> products = productRepository.findAll(pageable);
        return products.map(this::convertToDTO);
    }

    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return convertToDTO(product);
    }

    @Transactional
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = convertToEntity(productDTO);
        product = productRepository.save(product);
        return convertToDTO(product);
    }

    @Transactional
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product = productRepository.save(product);
        return convertToDTO(product);
    }

    @Transactional
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    private ProductDTO convertToDTO(Product product) {
        return new ProductDTO(product.getId(), product.getName(), product.getPrice());
    }

    private Product convertToEntity(ProductDTO productDTO) {
        return new Product(productDTO.getId(), productDTO.getName(), productDTO.getPrice());
    }
}

// === ARCHIVO: src/main/java/com/ecommerce/repository/ProductRepository.java ===
package com.ecommerce.repository;

import com.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

// === ARCHIVO: src/main/resources/config/application.yml ===
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password:
    driver-class-name: org.h2.Driver
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
  security:
    user:
      name: user
      password: password
  openApi:
    title: Ecommerce API
    description: API for managing products and orders
    version: 1.0


// === ARCHIVO: src/test/java/com/ecommerce/controller/ProductControllerTest.java ===
package com.ecommerce.controller;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Collections;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    void getAllProducts() throws Exception {
        Mockito.when(productService.getAllProducts(Mockito.any())).thenReturn(Collections.emptyList());
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void getProductById() throws Exception {
        ProductDTO productDTO = new ProductDTO(1L, "Product 1", 10.0);
        Mockito.when(productService.getProductById(Mockito.anyLong())).thenReturn(productDTO);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products/1"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void createProduct() throws Exception {
        ProductDTO productDTO = new ProductDTO(null, "Product 1", 10.0);
        Mockito.when(productService.createProduct(Mockito.any())).thenReturn(productDTO);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
               .contentType("application/json")
               .content("{\"name\":\"Product 1\",\"price\":10.0}"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

// === ARCHIVO: src/test/java/com/ecommerce/service/ProductServiceTest.java ===
package com.ecommerce.service;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import java.util.Collections;
import java.util.Optional;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    private Product product;
    private ProductDTO productDTO;

    @BeforeEach
    void setUp() {
        product = new Product(1L, "Product 1", 10.0);
        productDTO = new ProductDTO(1L, "Product 1", 10.0);
    }

    @Test
    void getAllProducts() {
        Mockito.when(productRepository.findAll(Mockito.any())).thenReturn(Collections.singletonList(product));
        Page<Product> productPage = new PageImpl<>(Collections.singletonList(product));
        Mockito.when(productRepository.findAll(Mockito.any())).thenReturn(productPage);
        Page<ProductDTO> result = productService.getAllProducts(Mockito.any());
        Mockito.verify(productRepository).findAll(Mockito.any());
        Mockito.verifyNoMoreInteractions(productRepository);
    }

    @Test
    void getProductById() {
        Mockito.when(productRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(product));
        ProductDTO result = productService.getProductById(Mockito.anyLong());
        Mockito.verify(productRepository).findById(Mockito.anyLong());
        Mockito.verifyNoMoreInteractions(productRepository);
    }

    @Test
    void createProduct() {
        Mockito.when(productRepository.save(Mockito.any())).thenReturn(product);
        ProductDTO result = productService.createProduct(Mockito.any());
        Mockito.verify(productRepository).save(Mockito.any());
        Mockito.verifyNoMoreInteractions(productRepository);
    }
}

// === ARCHIVO: src/test/resources/application-test.yml ===
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password:
    driver-class-name: org.h2.Driver
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
  security:
    user:
      name: user
      password: password


// === ARCHIVO: Dockerfile ===
FROM openjdk:21-jdk-alpine AS build
WORKDIR /app
COPY..
RUN./mvnw clean package -DskipTests

FROM openjdk:21-jdk-alpine AS runtime
WORKDIR /app
COPY --from=build /app/target/ecommerce-0.0.1-SNAPSHOT.jar /app/ecommerce.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/ecommerce.jar"]

// === ARCHIVO:.dockerignore ===
target/
*.jar
*.war
*.ear
*.class
*.log

// === ARCHIVO: src/main/resources/openapi.yaml ===
openapi: 3.0.1
info:
  title: Ecommerce API
  description: API for managing products and orders
  version: 1.0
paths:
  /api/products:
    get:
      summary: Get all products
      operationId: getAllProducts
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/ProductDTO'
    post:
      summary: Create a product
      operationId: createProduct
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/ProductDTO'
      responses:
        '201':
          description: Product created
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/ProductDTO'
  /api/products/{id}:
    get:
      summary: Get product by ID
      operationId: getProductById
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/ProductDTO'
    put:
      summary: Update product by ID
      operationId: updateProduct
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/ProductDTO'
      responses:
        '200':
          description: Product updated
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/ProductDTO'
    delete:
      summary: Delete product by ID
      operationId: deleteProduct
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      responses:
        '204':
          description: Product deleted
components:
  schemas:
    ProductDTO:
      type: object
      properties:
        id:
          type: integer
        name:
          type: string
        price:
          type: number
      required:
        - name
        - price

```
