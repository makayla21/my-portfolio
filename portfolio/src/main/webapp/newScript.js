/**Fethces the response from the server and adds it to the page */
async function showResponse() {
    const responseFromServer = await fetch('/hello');
    const textFromResponse = await responseFromServer.text();

    const responseContainer = document.getElementById('response-container');
    responseContainer.innerText = textFromResponse;
}