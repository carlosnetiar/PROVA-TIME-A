VERSION 5.00
Begin VB.Form frmSupConAteServiço 
   Caption         =   "SIAG"
   ClientHeight    =   5040
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   7050
   LinkTopic       =   "Form1"
   ScaleHeight     =   5040
   ScaleWidth      =   7050
   StartUpPosition =   3  'Windows Default
   Begin VB.Frame frarelatorio 
      Caption         =   "Relatório"
      Height          =   4815
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   6735
      Begin VB.ComboBox comSupConAteSerHora 
         Height          =   315
         Left            =   960
         TabIndex        =   9
         Top             =   2640
         Width           =   1815
      End
      Begin VB.ComboBox comSupAteSerDia 
         Height          =   315
         Left            =   960
         TabIndex        =   8
         Top             =   2040
         Width           =   1815
      End
      Begin VB.ComboBox comservico 
         Height          =   315
         Left            =   960
         TabIndex        =   5
         Top             =   1440
         Width           =   3375
      End
      Begin VB.TextBox txtnome 
         Height          =   375
         Left            =   960
         TabIndex        =   4
         Top             =   720
         Width           =   3375
      End
      Begin VB.CommandButton btoexecutar 
         Caption         =   "Executar"
         Height          =   495
         Left            =   2760
         TabIndex        =   3
         Top             =   3840
         Width           =   1095
      End
      Begin VB.Label lblhora 
         Caption         =   "Hora"
         Height          =   375
         Left            =   240
         TabIndex        =   7
         Top             =   2760
         Width           =   375
      End
      Begin VB.Label lbldia 
         Caption         =   "Dia"
         Height          =   375
         Left            =   240
         TabIndex        =   6
         Top             =   2160
         Width           =   255
      End
      Begin VB.Label lblservico 
         Caption         =   "Serviço"
         Height          =   255
         Left            =   240
         TabIndex        =   2
         Top             =   1440
         Width           =   615
      End
      Begin VB.Label lblnome 
         Caption         =   "Nome"
         Height          =   255
         Left            =   240
         TabIndex        =   1
         Top             =   720
         Width           =   495
      End
   End
End
Attribute VB_Name = "frmSupConAteServiço"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Label1_Click()
End Sub

Private Sub Data1_Validate(Action As Integer, Save As Integer)

End Sub

Private Sub frarelatorio_DragDrop(Source As Control, X As Single, Y As Single)

End Sub
