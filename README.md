# Desarrollo de API REST para e-commerce con Spring Boot

El sistema de e-commerce requiere una API REST que gestione productos y pedidos. Los productos y pedidos están asociados a clientes a través de relaciones OneToMany y ManyToMany. La autenticación y autorización se basan en JWT, con roles de ADMIN y USER. La documentación se genera automáticamente con OpenAPI 3.0 y Swagger UI. Los errores se manejan de manera centralizada y las entradas se validan con Bean Validation. Los resultados se paginan y ordenan. El sistema se prueba unitaria y de integración, y se containeriza con Docker.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Spring Boot Enterprise Architecture |
| **Nivel** | junior-l3 |
| **Tipo** | practical |
| **Tiempo estimado** | 40 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Arquitectura y modelado de datos

**Objetivo:** Definir la arquitectura en capas y modelar las entidades del dominio.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Diseñar la arquitectura en capas del sistema, incluyendo controladores REST, servicios de negocio y repositorios JPA.
- Modelar las entidades Product, Order y Customer con relaciones OneToMany y ManyToMany.
- Establecer las restricciones de validación en las entidades.

**Entregable:** Diagrama de arquitectura y entidades modeladas con relaciones y restricciones de validación.

<details>
<summary>Pistas de conocimiento</summary>

- Considerar la separación de responsabilidades en cada capa.
- Identificar las relaciones entre entidades y sus implicaciones en el modelo de datos.

</details>

### Fase 2: Autenticación y autorización

**Objetivo:** Implementar la autenticación y autorización basada en JWT.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Configurar la autenticación y autorización basada en JWT con Spring Security.
- Definir los roles de ADMIN y USER y establecer el acceso diferenciado por endpoint.

**Entregable:** Configuración de autenticación y autorización con JWT y roles definidos.

<details>
<summary>Pistas de conocimiento</summary>

- Considerar la seguridad de las credenciales y la gestión de tokens.
- Identificar los endpoints que requieren acceso diferenciado.

</details>

### Fase 3: Documentación y manejo de errores

**Objetivo:** Generar documentación automática y manejar errores de manera centralizada.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Generar documentación automática con OpenAPI 3.0 y Swagger UI.
- Implementar manejo centralizado de errores con @ControllerAdvice y respuestas estandarizadas en formato JSON.

**Entregable:** Documentación generada automáticamente y manejo centralizado de errores.

<details>
<summary>Pistas de conocimiento</summary>

- Considerar la claridad y accesibilidad de la documentación.
- Identificar los tipos de errores y sus respuestas estandarizadas.

</details>

### Fase 4: Validación de entradas y paginación

**Objetivo:** Validar las entradas y paginar los resultados.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Validar las entradas con Bean Validation usando @Valid, @NotNull y @Size.
- Implementar paginación y ordenamiento de resultados en los endpoints de listado usando Pageable.

**Entregable:** Validación de entradas y paginación de resultados implementadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considerar los posibles valores inválidos y sus implicaciones.
- Identificar los criterios de ordenamiento y paginación.

</details>

### Fase 5: Pruebas y containerización

**Objetivo:** Realizar pruebas unitarias e de integración y containerizar el sistema.

**Tiempo estimado:** 14 horas

**Instrucciones:**

- Realizar pruebas unitarias con JUnit 5 y Mockito cubriendo la capa de servicio al menos al 80%.
- Realizar pruebas de integración con @SpringBootTest verificando los flujos principales.
- Containerizar el sistema con Docker usando Dockerfile multi-stage optimizado para producción.

**Entregable:** Pruebas unitarias e de integración realizadas y sistema containerizado.

<details>
<summary>Pistas de conocimiento</summary>

- Considerar la cobertura de pruebas y la optimización del Dockerfile.
- Identificar los flujos principales a verificar en las pruebas de integración.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la arquitectura en capas y cómo se aplica en este sistema?
- **paraQueSirve**: ¿Para qué sirve la autenticación y autorización basada en JWT en este sistema?
- **comoSeUsa**: ¿Cómo se usa la paginación y ordenamiento de resultados en los endpoints de listado?
- **erroresComunes**: ¿Cuáles son los errores comunes al validar entradas y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la containerización del sistema con Docker?

## Criterios de Evaluacion

- Definir la arquitectura en capas y modelar las entidades del dominio.
- Implementar la autenticación y autorización basada en JWT.
- Generar documentación automática y manejar errores de manera centralizada.
- Validar las entradas y paginar los resultados.
- Realizar pruebas unitarias e de integración y containerizar el sistema.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
