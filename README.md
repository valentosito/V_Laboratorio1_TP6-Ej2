
## Detalles a tener en cuenta para próximos proyectos:

### La abstracción de responsabilidades.

- cargar productos en una JTable;
- limpiar una JTable;
- validar campos;
- convertir String a números;
- cargar los datos de un Producto en los campos;
- mostrar productos encontrados.

El caso de cargar productos en la JTable es una operación común a todas las consultas, 
entonces cargarProductosEnTabla() en una clase auxiliar reutilizable hubiese sido mejor.

### Analizar si el bloque de código repetido representa una responsabilidad independiente o no:

**¿Se repite dentro de una clase?**  
→ método

**¿Se necesita en varias clases? ¿Tiene una responsabilidad propia?**  
→ clase auxiliar

**¿Necesito definir un contrato común para distintas clases?**  
→ interfaz
