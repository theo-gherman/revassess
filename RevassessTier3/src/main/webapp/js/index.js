/**
 * use the provided url to receive the
 * json object and assign it to the resp
 * variable in this function. this is for 
 * testing purposes, do not change the getResp
 * function and leave the function names alone. 
 * the url for the api is:
 *  http://ec2-3-19-123-54.us-east-2.compute.amazonaws.com:9999/flashcard
 */
let resp;
async function callFlashcardApi(){
    
    return resp;
}

/**
 * manipulate the dom with this function
 */
function manipDom(){
    document.getElementById('cardId').innerHTML=1;
    document.getElementById('cardQstn').innerHTML="core java question";
    document.getElementById('cardCat').innerHTML='core java';
    document.getElementById('cardAns').innerHTML='dummy answer';
    console.log("this function ran");
}

function getResp(){
    return resp;
}