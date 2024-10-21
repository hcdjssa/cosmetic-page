function loginUser() {
    const username = document.querySelector('input[type="text"]').value;
    const password = document.querySelector('input[type="password"]').value;

    fetch('/auth/login', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ username: username, password: password })
    })
    .then(response => response.text())
    .then(data => alert(data))
    .catch(error => console.error('Error:', error));
}

function fetchProducts() {
    fetch('/products/list')
        .then(response => response.json())
        .then(data => {
            const productList = document.getElementById('product-list');
            productList.innerHTML = '';
            data.forEach(product => {
                productList.innerHTML += `<div><h3>${product.name}</h3><p>${product.description}</p><img src="${product.imageUrl}" alt="Product Image"></div>`;
            });
        })
        .catch(error => console.error('Error:', error));
}
