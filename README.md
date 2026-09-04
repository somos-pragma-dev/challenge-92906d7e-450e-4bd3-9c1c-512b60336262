# Diseño y Desarrollo de una API REST Empresarial

El objetivo es desarrollar una API REST para la gestión de productos y pedidos en un e-commerce. El sistema debe manejar productos, pedidos y clientes, con relaciones de uno a muchos y muchos a muchos. La autenticación y autorización se realizarán mediante JWT, con roles de ADMIN y USER. Se requiere documentación automática con OpenAPI y Swagger UI, manejo centralizado de errores, validación de entradas, paginación y ordenamiento de resultados, y pruebas unitarias e de integración. El sistema debe ser containerizado con Docker.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura Empresarial con Spring Boot |
| **Nivel** | junior-l2 |
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

### Fase 1: Modelado de Datos

**Objetivo:** Definir y modelar las entidades del dominio: Product, Order y Customer.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Identificar las relaciones entre las entidades (OneToMany y ManyToMany).
- Definir los atributos de cada entidad y sus restricciones.
- Documentar las decisiones de modelado y las relaciones entre entidades.

**Entregable:** Diagrama de relaciones de las entidades y documentación del modelado.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la cardinalidad y las restricciones de negocio al modelar las relaciones.
- Piensa en cómo las relaciones impactarán en las operaciones CRUD.

</details>

### Fase 2: Autenticación y Autorización

**Objetivo:** Implementar la autenticación y autorización basada en JWT con roles de ADMIN y USER.

**Tiempo estimado:** 10 horas

**Instrucciones:**

- Configurar Spring Security para manejar JWT.
- Definir los roles de ADMIN y USER y sus permisos de acceso.
- Asegurar que los endpoints tengan acceso diferenciado según el rol.

**Entregable:** Configuración de Spring Security y documentación de los roles y permisos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los posibles puntos de falla en la autenticación y cómo manejarlos.
- Piensa en cómo los roles impactarán en el acceso a los recursos.

</details>

### Fase 3: Documentación Automática

**Objetivo:** Configurar la documentación automática con OpenAPI y Swagger UI.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Integrar OpenAPI y Swagger UI en el proyecto.
- Documentar los endpoints y sus parámetros.
- Asegurar que la documentación esté accesible en /api-docs.

**Entregable:** Configuración de OpenAPI y Swagger UI y documentación de los endpoints.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la claridad y la precisión en la documentación de los endpoints.
- Piensa en cómo la documentación impactará en la usabilidad de la API.

</details>

### Fase 4: Manejo de Errores

**Objetivo:** Implementar el manejo centralizado de errores con @ControllerAdvice.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Configurar @ControllerAdvice para manejar los errores.
- Definir respuestas estandarizadas en formato JSON.
- Asegurar que los errores sean manejados de manera consistente en toda la API.

**Entregable:** Configuración de @ControllerAdvice y documentación de las respuestas de error.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los diferentes tipos de errores que pueden ocurrir y cómo manejarlos.
- Piensa en cómo las respuestas de error impactarán en la experiencia del usuario.

</details>

### Fase 5: Validación de Entradas

**Objetivo:** Implementar la validación de entradas con Bean Validation.

**Tiempo estimado:** 5 horas

**Instrucciones:**

- Configurar Bean Validation para validar las entradas.
- Usar anotaciones como @Valid, @NotNull y @Size para validar los parámetros de los endpoints.
- Asegurar que las validaciones sean aplicadas de manera consistente en toda la API.

**Entregable:** Configuración de Bean Validation y documentación de las validaciones.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los diferentes tipos de validaciones que pueden ser necesarias.
- Piensa en cómo las validaciones impactarán en la calidad de los datos.

</details>

### Fase 6: Paginación y Ordenamiento

**Objetivo:** Implementar la paginación y el ordenamiento de resultados en los endpoints de listado.

**Tiempo estimado:** 5 horas

**Instrucciones:**

- Configurar la paginación y el ordenamiento usando Pageable.
- Asegurar que los endpoints de listado soporten paginación y ordenamiento.
- Documentar las opciones de paginación y ordenamiento disponibles.

**Entregable:** Configuración de paginación y ordenamiento y documentación de las opciones disponibles.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los diferentes parámetros que pueden ser necesarios para la paginación y el ordenamiento.
- Piensa en cómo la paginación y el ordenamiento impactarán en la usabilidad de la API.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las entidades del dominio y cómo se relacionan?
- **paraQueSirve**: ¿Para qué sirve la autenticación y autorización basada en JWT?
- **comoSeUsa**: ¿Cómo se usa OpenAPI y Swagger UI para documentar una API?
- **erroresComunes**: ¿Cuáles son los errores comunes al manejar excepciones en una API REST?
- **queDecisionesImplica**: ¿Qué decisiones implica el modelado de datos en una API REST?

## Criterios de Evaluacion

- Modelado correcto de las entidades del dominio.
- Implementación de la autenticación y autorización basada en JWT.
- Configuración de la documentación automática con OpenAPI y Swagger UI.
- Implementación del manejo centralizado de errores con @ControllerAdvice.
- Implementación de la validación de entradas con Bean Validation.
- Implementación de la paginación y el ordenamiento de resultados en los endpoints de listado.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
