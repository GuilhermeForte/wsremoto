function carregarartista(){
fetch("http://localhost:8080/artistas")
.then(res=>res.json())
.then(res=>{
    var artistas="";
    for(contador=0;contador<res.length;contador++){
        artistas+=
        "<option value='"+res[contador].id+"'>"+res[contador].nomeArtistico+"</option>";
    }
    document.getElementById("cmbartistas").innerHTML=artistas;
});
}

function filtrar(){
fetch("http://localhost:8080/artista/"+document.getElementById("cmbartistas").value)
.then(res=>res.json())
.then(res=>{
    var tabela="<table border='1' align='center'>"+"<tr><th>musica</th>"+"<th>lançamento</th>"+"<th>ID</th></tr>";
    for(contador=0;contador<res.musica.length;contador++){
        tabela+=
        "<tr><td>"+res.musica[contador].titulo+"</td>"+"<td>"+res.musica[contador].lancamento+"</td>"+"<td>"+res.musica[contador].id+"</td></tr>";
    }
    tabela+="</tabela>";
    document.getElementById("tabela").innerHTML=tabela;
});
}