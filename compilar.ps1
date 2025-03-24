
# Buscar todos los archivos .java dentro de 'src' y compilar
$javaFiles = Get-ChildItem -Recurse -Filter *.java -Path src | ForEach-Object { $_.FullName }

if ($javaFiles.Count -eq 0) {
    Write-Host "No se encontraron archivos .java en src/"
} else {
    javac -d bin $javaFiles
    if ($?) {
        Write-Host " Compilación completada correctamente."
    } else {
        Write-Host " Error al compilar."
    }
}
