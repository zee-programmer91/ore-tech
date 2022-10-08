let lesotho = document.getElementById("LS");
let easternCape = document.getElementById("ZA-EC");
let freeState = document.getElementById("ZA-FS");
let gauteng = document.getElementById("ZA-GP");
let limpopo = document.getElementById("ZA-LP");
let mpumalanga = document.getElementById("ZA-MP");
let northernCape = document.getElementById("ZA-NC");
let kwaZuluNatal = document.getElementById("ZA-NL");
let northWest = document.getElementById("ZA-NW");
let westernCape = document.getElementById("ZA-WC");


lesotho.addEventListener("mouseover", changeLesothoFill);
easternCape.addEventListener("mouseover", changeEasternCapeFill);
freeState.addEventListener("mouseover", changeFreeStateFill);
gauteng.addEventListener("mouseover", changeGautengFill);
limpopo.addEventListener("mouseover", changeLimpopoFill);
mpumalanga.addEventListener("mouseover", changeMpumalangaFill);
northernCape.addEventListener("mouseover", changeNorthernCapeFill);
kwaZuluNatal.addEventListener("mouseover", changeKwaZuluNatalFill);
northWest.addEventListener("mouseover", changeNorthWestFill);
westernCape.addEventListener("mouseover", changeWesternCapeFill);

lesotho.addEventListener("mouseleave", changeLesothoBack);
easternCape.addEventListener("mouseleave", changeEasternCapeBack);
freeState.addEventListener("mouseleave", changeFreeStateBack);
gauteng.addEventListener("mouseleave", changeGautengBack);
limpopo.addEventListener("mouseleave", changeLimpopoBack);
mpumalanga.addEventListener("mouseleave", changeMpumalangaBack);
northernCape.addEventListener("mouseleave", changeNorthernCapeBack);
kwaZuluNatal.addEventListener("mouseleave", changeKwaZuluNatalBack);
northWest.addEventListener("mouseleave", changeNorthWestBack);
westernCape.addEventListener("mouseleave", changeWesternCapeBack);

let limpopoImg = document.getElementById("limpopo-img");
var downloadingImage = new Image();

downloadingImage.onload = function(){
    limpopoImg.src = this.src;
};

downloadingImage.src = "images/limpopo.jpg";


$(document).ready(function(){
    $(".hide").hide();

    $(".marker-lesotho").hover(function(){
        $(".hide").hide();
        $(".Lesotho-txt").fadeIn(300);
    });

    $(".marker-FS").hover(function(){
        $(".hide").hide();
        $(".FS-txt").fadeIn(300);
    });

    $(".marker-KZN").hover(function(){
        $(".hide").hide();
        $(".KZN-txt").fadeIn(300);
      });
      

    $(".marker-WC").hover(function(){
        $(".hide").hide();
        $(".WC-txt").fadeIn(300);
    });

    $(".marker-Limpopo").hover(function(){
        $(".hide").hide();
        $(".Limpopo-txt").fadeIn(300);
    });

    $(".marker-Gauteng").hover(function(){
        $(".hide").hide();
        $(".Gauteng-txt").fadeIn(300);
    });

    $(".marker-NW").hover(function(){
        $(".hide").hide();
        $(".NW-txt").fadeIn(300);
    });

    $(".marker-MP").hover(function(){
        $(".hide").hide();
        $(".Mpumalanga-txt").fadeIn(300);
    });

    $(".marker-EC").hover(function(){
        $(".hide").hide();
        $(".EC-txt").fadeIn(300);
    });

    $(".marker-NC").hover(function(){
        $(".hide").hide();
        $(".NC-txt").fadeIn(300);
    });
});


function changeLesothoFill() {
    lesotho.style.fill = "rgb(160, 170, 187)";
}

function changeEasternCapeFill() {
    easternCape.style.fill = "rgb(160, 170, 187)";
}

function changeFreeStateFill() {
    freeState.style.fill = "rgb(160, 170, 187)";
}

function changeGautengFill() {
    gauteng.style.fill = "rgb(160, 170, 187)";
}

function changeLimpopoFill() {
    limpopo.style.fill = "rgb(160, 170, 187)";
}

function changeMpumalangaFill() {
    mpumalanga.style.fill = "rgb(160, 170, 187)";
}

function changeNorthernCapeFill() {
    northernCape.style.fill = "rgb(160, 170, 187)";
}

function changeKwaZuluNatalFill() {
    kwaZuluNatal.style.fill = "rgb(160, 170, 187)";
}

function changeNorthWestFill() {
    northWest.style.fill = "rgb(160, 170, 187)";
}

function changeWesternCapeFill() {
    westernCape.style.fill = "rgb(160, 170, 187)";
}

function changeLesothoBack() {
    lesotho.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-Lesotho").style.display = "none";
}

function changeEasternCapeBack() {
    easternCape.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-EC").style.display = "none";
}

function changeFreeStateBack() {
    freeState.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-FS").style.display = "none";
}

function changeGautengBack() {
    gauteng.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-Gauteng").style.display = "none";
}

function changeLimpopoBack() {
    limpopo.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-Limpopo").style.display = "none";
}

function changeMpumalangaBack() {
    mpumalanga.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-Mpumalanga").style.display = "none";
}

function changeNorthernCapeBack() {
    northernCape.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-NC").style.display = "none";
}

function changeKwaZuluNatalBack() {
    kwaZuluNatal.style.fill = "rgb(105, 105, 105)";
    document.getElementById("text-kzn").style.display = "none";
}

function changeNorthWestBack() {
    northWest.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-NW").style.display = "none";
}

function changeWesternCapeBack() {
    westernCape.style.fill = "rgb(105, 105, 105)  ";
    document.getElementById("text-WC").style.display = "none";
}
