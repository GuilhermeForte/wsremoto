function carregarusuario(){
    var user=localStorage.getItem("userlogado");
    if(user==null){
        window.location="login.thml"
    }else{
        var userjson=JSON.parse(user);
        document.getElementById("dados").innerHTML="<h4>"+ userjson.nome+"<br>"+userjson.id+"<br>"+userjson.email+"</h4>";
        document.getElementById("foto").innerHTML="<img width='20%' height='20%' alt='foto do usuario' src=imagens/"+userjson.foto+">";

    }
}

function logar(){
    var userjson={
        email:document.getElementById("txtemail").value,
        senha:document.getElementById("txtsenha").value
    }
    var cabecalho={
        method:"POST",body:JSON.stringify(userjson),
        headers:{
            "Content-type":"application/json"
        }
    }
    fetch("http://localhost:8080/login", cabecalho)
    .then(res=>res.json())
    .then(res=>{
        localStorage.setItem("userlogado", JSON.stringify(res));
        window.location="usuario.html";
    })
    .catch(err=>
        {window.alert("login não realizado");
    });
}