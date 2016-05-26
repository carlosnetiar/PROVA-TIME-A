VERSION 5.00
Begin VB.Form frmSupConAteDia 
   Caption         =   "Consulta"
   ClientHeight    =   3675
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   5040
   LinkTopic       =   "Form1"
   ScaleHeight     =   3675
   ScaleWidth      =   5040
   StartUpPosition =   3  'Windows Default
   Begin VB.Frame fraDia 
      Caption         =   "Relatório"
      Height          =   3495
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   4815
      Begin VB.ComboBox comSupConAteDia 
         Height          =   315
         Left            =   1080
         TabIndex        =   5
         Top             =   1560
         Width           =   3135
      End
      Begin VB.TextBox txtSupConAteNome 
         Height          =   375
         Left            =   1080
         TabIndex        =   4
         Top             =   720
         Width           =   3135
      End
      Begin VB.CommandButton btoSupConAteDia 
         Caption         =   "Executar"
         Height          =   495
         Left            =   1800
         TabIndex        =   3
         Top             =   2520
         Width           =   1215
      End
      Begin VB.Label lblSupConAtedia 
         Caption         =   "Dia"
         Height          =   255
         Left            =   240
         TabIndex        =   2
         Top             =   1560
         Width           =   375
      End
      Begin VB.Label lblSupConAtenome 
         Caption         =   "Nome"
         Height          =   615
         Left            =   240
         TabIndex        =   1
         Top             =   720
         Width           =   615
      End
   End
End
Attribute VB_Name = "frmSupConAteDia"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Label2_Click()

End Sub

