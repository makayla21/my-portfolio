/**Fethces the response from the server and adds it to the page */
async function showResponse() {
    const responseFromServer = await fetch('/hello');
    const myObject = await responseFromServer.json();

    const responseContainer = document.getElementById('response-container');
    responseContainer.innerText = myObject;
}