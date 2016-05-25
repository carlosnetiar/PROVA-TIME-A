Attribute VB_Name = "ModuloConexao"
Public adosisagenda As ADODB.Connection
Public Function abrirconexao(ByVal stringconexao) As ADODB.Connection
On Error GoTo Tratamento
    Set abrirconexao = New ADODB.Connection
    abrirconexao.CursorLocation = adUseClient
    abrirconexao.ConnectionString = stringconexao
    abrirconexao.Open
    
    Exit Function
Tratamento:
    Set abrirconexao = Nothing
    Debug.Print Err.Description
    
End Function


Sub Main()
    Set adosisagenda = abrirconexao("DRIVER={MySQL ODBC 3.51 Driver};SERVER=179.188.16.12;DATABASE=sisagenda;UID=sisagenda;PWD=s1s4g3nd4; OPTION=3")
    If (adosisagenda Is Nothing) Then
        MsgBox "Não foi possível abrir a conexão com o Banco de Dados", vbInformation + vbOKOnly + vbApplicationModal, "sisagenda"
        End
    End If
    frmSplash.Show
End Sub
