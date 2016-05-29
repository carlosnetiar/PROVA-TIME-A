VERSION 5.00
Object = "{86CF1D34-0C5F-11D2-A9FC-0000F8754DA1}#2.0#0"; "MSCOMCT2.OCX"
Begin VB.Form frmSupConAteServiço 
   BorderStyle     =   3  'Fixed Dialog
   Caption         =   "SIAG"
   ClientHeight    =   5040
   ClientLeft      =   45
   ClientTop       =   375
   ClientWidth     =   7050
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MDIChild        =   -1  'True
   MinButton       =   0   'False
   ScaleHeight     =   5040
   ScaleWidth      =   7050
   ShowInTaskbar   =   0   'False
   Begin VB.Frame frarelatorio 
      Caption         =   "Relatório"
      Height          =   4815
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   6735
      Begin MSComCtl2.DTPicker DTPickerRelatorio 
         Height          =   375
         Left            =   960
         TabIndex        =   9
         Top             =   2040
         Width           =   1815
         _ExtentX        =   3201
         _ExtentY        =   661
         _Version        =   393216
         Format          =   94437377
         CurrentDate     =   42517
      End
      Begin VB.ComboBox comSupConAteSerHora 
         Height          =   315
         Left            =   960
         TabIndex        =   8
         Top             =   2640
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
         ForeColor       =   &H000000FF&
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
         ForeColor       =   &H000000FF&
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
Private Sub Salvar()
    If FG_ValidaForm(Me) Then
    End If
End Sub

Private Sub Form_Load()
    comSupConAteSerHora.AddItem "09:00", 0
    comSupConAteSerHora.AddItem "10:00", 1
    comSupConAteSerHora.AddItem "11:00", 2
    comSupConAteSerHora.AddItem "12:00", 3
    comSupConAteSerHora.AddItem "14:00", 4
    comSupConAteSerHora.AddItem "15:00", 5
    comSupConAteSerHora.AddItem "16:00", 6
    comSupConAteSerHora.AddItem "17:00", 7
    comSupConAteSerHora.AddItem "18:00", 8

End Sub
