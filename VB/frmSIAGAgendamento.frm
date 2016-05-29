VERSION 5.00
Begin VB.MDIForm frmSIAGAgendamento 
   BackColor       =   &H80000018&
   Caption         =   "SIAG"
   ClientHeight    =   7455
   ClientLeft      =   225
   ClientTop       =   555
   ClientWidth     =   15105
   Icon            =   "frmSIAGAgendamento.frx":0000
   LinkTopic       =   "MDIForm1"
   Picture         =   "frmSIAGAgendamento.frx":000C
   StartUpPosition =   1  'CenterOwner
   WindowState     =   2  'Maximized
   Begin VB.Menu mnuSupervisor 
      Caption         =   "&Supervisor"
      Index           =   1
      Begin VB.Menu mnuSupCadastro 
         Caption         =   "&Cadastro"
         Index           =   2
         Begin VB.Menu mnuSupCadAtendente 
            Caption         =   "&Atendente"
            Index           =   3
         End
      End
      Begin VB.Menu mnuEspaço 
         Caption         =   "-"
         Index           =   4
      End
      Begin VB.Menu mnuSupConsulta 
         Caption         =   "&Consulta"
         Index           =   10
         Begin VB.Menu mnuSupConAtendimento 
            Caption         =   "&Atendimento "
            Index           =   11
            Begin VB.Menu mnuSupConAteServiço 
               Caption         =   "&Serviço"
               Index           =   12
            End
         End
      End
   End
   Begin VB.Menu mnuAtendente 
      Caption         =   "&Atendente"
      Index           =   20
      Begin VB.Menu mnuAteCadastro 
         Caption         =   "&Cadastro"
         Index           =   21
         Begin VB.Menu mnuAteCadAluno 
            Caption         =   "&Aluno"
            Index           =   22
         End
         Begin VB.Menu mnuAteCadHorario 
            Caption         =   "&Horário"
            Index           =   22
         End
      End
   End
   Begin VB.Menu mnuServiço 
      Caption         =   "&Serviço"
      Index           =   30
      Begin VB.Menu mnuSerPresencial 
         Caption         =   "&Presencial"
         Index           =   31
      End
   End
   Begin VB.Menu mnuSobre 
      Caption         =   "&Sobre"
      Index           =   40
   End
   Begin VB.Menu mnuSair 
      Caption         =   "&Sair"
      Index           =   50
   End
End
Attribute VB_Name = "frmSIAGAgendamento"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Public adosisagenda As ADODB.Connection
Public rstabela   As ADODB.Recordset

Private Sub mnuAteCadAluno_Click(Index As Integer)
    frmAteCadAluno.Show
End Sub

Private Sub mnuAteCadHorario_Click(Index As Integer)
    frmAteCadHorario.Show
End Sub

Private Sub mnuSair_Click(Index As Integer)
    Dim vResposta As Integer
    vResposta = MsgBox("Deseja sair do sistema?", vbYesNo + vbQuestion, "SIAG")
    If vResposta = vbYes Then End
End Sub

Private Sub mnuSerPresencial_Click(Index As Integer)
    frmSerPresencial.Show
End Sub

Private Sub mnuSobre_Click(Index As Integer)
    frmSobre.Show
End Sub

Private Sub mnuSupCadAtendente_Click(Index As Integer)
    frmSupCadAtendente.Show
End Sub

Private Sub mnuSupConAteDia_Click(Index As Integer)
    frmSupConAteDia.Show
End Sub

Private Sub mnuSupConAteServiço_Click(Index As Integer)
    frmSupConAteServiço.Show
End Sub
