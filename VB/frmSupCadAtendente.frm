VERSION 5.00
Object = "{831FDD16-0C5C-11D2-A9FC-0000F8754DA1}#2.0#0"; "MSCOMCTL.OCX"
Begin VB.Form frmSupCadAtendente 
   Caption         =   "SIAG"
   ClientHeight    =   5655
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   8010
   LinkTopic       =   "Form1"
   ScaleHeight     =   5655
   ScaleWidth      =   8010
   StartUpPosition =   3  'Windows Default
   Begin MSComctlLib.ImageList ImageList1 
      Left            =   6720
      Top             =   4440
      _ExtentX        =   1005
      _ExtentY        =   1005
      BackColor       =   -2147483643
      ImageWidth      =   32
      ImageHeight     =   32
      MaskColor       =   12632256
      _Version        =   393216
      BeginProperty Images {2C247F25-8591-11D1-B16A-00C0F0283628} 
         NumListImages   =   4
         BeginProperty ListImage1 {2C247F27-8591-11D1-B16A-00C0F0283628} 
            Picture         =   "frmSupCadAtendente.frx":0000
            Key             =   "Novo"
         EndProperty
         BeginProperty ListImage2 {2C247F27-8591-11D1-B16A-00C0F0283628} 
            Picture         =   "frmSupCadAtendente.frx":62B6
            Key             =   "Abrir"
         EndProperty
         BeginProperty ListImage3 {2C247F27-8591-11D1-B16A-00C0F0283628} 
            Picture         =   "frmSupCadAtendente.frx":70D6
            Key             =   "Salvar"
         EndProperty
         BeginProperty ListImage4 {2C247F27-8591-11D1-B16A-00C0F0283628} 
            Picture         =   "frmSupCadAtendente.frx":C686
            Key             =   "Sair"
         EndProperty
      EndProperty
   End
   Begin VB.Frame fraSupCadAtendente 
      Caption         =   "Cadastro de Atendente"
      Height          =   4815
      Left            =   120
      TabIndex        =   0
      Top             =   720
      Width           =   7695
      Begin VB.ComboBox comSupCadAteGuiche 
         Height          =   315
         Left            =   1200
         TabIndex        =   10
         Top             =   3480
         Width           =   1455
      End
      Begin VB.TextBox txtSupCadAteEmail 
         Height          =   375
         Left            =   1200
         TabIndex        =   9
         Top             =   2760
         Width           =   4095
      End
      Begin VB.TextBox txtSupCadAteTelefone 
         Height          =   405
         Left            =   1200
         TabIndex        =   8
         Top             =   1920
         Width           =   2655
      End
      Begin VB.TextBox txtSupCadAteCPF 
         Height          =   375
         Left            =   1200
         TabIndex        =   7
         Top             =   1200
         Width           =   2655
      End
      Begin VB.TextBox txtSupCadAteNome 
         Height          =   375
         Left            =   1200
         TabIndex        =   6
         Top             =   480
         Width           =   5415
      End
      Begin VB.Label lblguiche 
         Caption         =   "Guichê"
         Height          =   375
         Left            =   360
         TabIndex        =   5
         Top             =   3480
         Width           =   615
      End
      Begin VB.Label lblemail 
         Caption         =   "E-mail"
         Height          =   375
         Left            =   360
         TabIndex        =   4
         Top             =   2760
         Width           =   615
      End
      Begin VB.Label lbltelefone 
         Caption         =   "Telefone"
         Height          =   375
         Left            =   360
         TabIndex        =   3
         Top             =   2040
         Width           =   615
      End
      Begin VB.Label lblCPF 
         Caption         =   "CPF"
         Height          =   375
         Left            =   360
         TabIndex        =   2
         Top             =   1320
         Width           =   615
      End
      Begin VB.Label lblNome 
         Caption         =   "Nome"
         Height          =   375
         Left            =   360
         TabIndex        =   1
         Top             =   600
         Width           =   615
      End
   End
   Begin MSComctlLib.Toolbar tooSupCadAteIcone 
      Align           =   1  'Align Top
      Height          =   660
      Left            =   0
      TabIndex        =   11
      Top             =   0
      Width           =   8010
      _ExtentX        =   14129
      _ExtentY        =   1164
      ButtonWidth     =   1032
      ButtonHeight    =   1005
      Appearance      =   1
      ImageList       =   "ImageList1"
      _Version        =   393216
      BeginProperty Buttons {66833FE8-8583-11D1-B16A-00C0F0283628} 
         NumButtons      =   4
         BeginProperty Button1 {66833FEA-8583-11D1-B16A-00C0F0283628} 
            Object.ToolTipText     =   "Novo"
            ImageIndex      =   1
         EndProperty
         BeginProperty Button2 {66833FEA-8583-11D1-B16A-00C0F0283628} 
            Object.ToolTipText     =   "Editar"
            ImageIndex      =   2
         EndProperty
         BeginProperty Button3 {66833FEA-8583-11D1-B16A-00C0F0283628} 
            Key             =   "Salvar"
            Object.ToolTipText     =   "Salvar"
            ImageIndex      =   3
         EndProperty
         BeginProperty Button4 {66833FEA-8583-11D1-B16A-00C0F0283628} 
            Key             =   "Sair"
            Object.ToolTipText     =   "Sair"
            ImageIndex      =   4
         EndProperty
      EndProperty
   End
End
Attribute VB_Name = "frmSupCadAtendente"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub btoSupCadAtesalvar_Click()
    MsgBox "Salvo com Sucesso", vbInformation, "SIAG"
End Sub

Private Sub Toolbar1_ButtonClick(ByVal Button As MSComctlLib.Button)
Select Case Button.Index
        Case 1
            'Novo Arquivo
        Case 2
            'Abrir arquivo
        Case 3
            On Error GoTo Trata_Erro

    sScript = ""
    sScript = sScript & "SELECT * FROM tbl_usuario "
    sScript = sScript & "WHERE nome = '" & txtSupCadAteNome.Text & "'"
    Set rsTabela = adosisagenda.Execute(sScript)
    With rsTabela
    End With
    MsgBox "Salvo com Sucesso", vbInformation, "SIAG"
    Exit Sub


Trata_Erro:
    adosisagenda.RollbackTrans

        Case 4
            Unload frmAteCadAluno
    End Select
End Sub

End Sub

Private Sub tooSupCadAteIcone_ButtonClick(ByVal Button As MSComctlLib.Button)
    Select Case Button.Index
        Case 1
            'Novo Arquivo
        Case 2
            'Abrir arquivo
        Case 3
            On Error GoTo Trata_Erro

    sScript = ""
    sScript = sScript & "SELECT * FROM tbl_usuario "
    sScript = sScript & "WHERE nome = '" & txtSupCadAteNome.Text & "'"
    Set rsTabela = adosisagenda.Execute(sScript)
    With rsTabela
        adosisagenda.BeginTrans
        If .EOF Then 'SE FOR FINAL DE ARQUIVO - REGISTRO NÃO EXISTE
            'INSERE REGISTRO
            sScript = ""
            sScript = sScript & "INSERT INTO tbl_usuario"
            sScript = sScript & "(nome) VALUES ('" & txtSupCadAteNome.Text & "') "
            
        Else
            'ALTERA REGISTRO
            sScript = ""
            sScript = sScript & "UPDATE tbl_usuario"
            sScript = sScript & "SET nome = " & txtSupCadAteNome.Text
            sScript = sScript & "WHERE nome = '" & txtSupCadAteNome.Text & "'"
        End If
        adosisagenda.CommitTrans
    End With
    MsgBox "Salvo com Sucesso", vbInformation, "SIAG"
    Exit Sub


Trata_Erro:
    adosisagenda.RollbackTrans

        Case 4
            Unload frmSupCadAtendente
    End Select
End Sub
