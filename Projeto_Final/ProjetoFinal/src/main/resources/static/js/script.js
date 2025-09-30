

document.addEventListener('DOMContentLoaded', function() {
    const fileInput = document.getElementById('fotoPessoa');
    const form = fileInput ? fileInput.closest('form') : null;

    
    const MAX_FILE_SIZE_BYTES = 5 * 1024 * 1024; 

    if (form) {
        form.addEventListener('submit', function(event) {
            if (fileInput.files.length > 0) {
                const fileSize = fileInput.files[0].size;

                if (fileSize > MAX_FILE_SIZE_BYTES) {
                    event.preventDefault(); 
                    const maxSizeMB = (MAX_FILE_SIZE_BYTES / (1024 * 1024)).toFixed(0);
                    alert(`Erro: O tamanho da imagem (${(fileSize / (1024 * 1024)).toFixed(2)} MB) 
                    excede o limite máximo permitido de ${maxSizeMB} MB.`);
                    fileInput.value = ""; 
                }
            }
        });
    }
});