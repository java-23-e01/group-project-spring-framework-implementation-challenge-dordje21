function initForm() {
    const form = document.querySelector('#form-post');
        form.addEventListener('submit', (event) => {
        event.preventDefault()

        const formData = new FormData(form);

        fetch('http://localhost:8080/post', {
            method: 'POST',
            body: formData
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.text(); // or response.json() if expecting JSON data
            })
            .then(data => {
                console.log('Success:', data);
                // Handle success response here
                alert(data)
            })
            .catch(error => {
                console.error('Error:', error);
                // Handle error here
            });
    })
}

initForm()