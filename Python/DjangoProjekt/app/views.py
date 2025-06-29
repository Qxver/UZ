from django.shortcuts import render, redirect
from django.contrib.auth import login, logout
from django.contrib.auth.forms import AuthenticationForm
from django.contrib.auth.decorators import login_required
from .forms import Rejestracja, NotatkiForm
from .models import Notatki


def rejestracja(request):
    if request.method == 'POST':
        form = Rejestracja(request.POST)
        if form.is_valid():
            user = form.save()
            login(request, user)
            return redirect('home')
    else:
        form = Rejestracja()
    return render(request, 'rejestracja.html', {'form': form})

def login_view(request):
    if request.method == 'POST':
        form = AuthenticationForm(request, data=request.POST)
        if form.is_valid():
            user = form.get_user()
            login(request, user)
            return redirect('home')
    else:
        form = AuthenticationForm()
    return render(request, 'login.html', {'form': form})

def logout_view(request):
    logout(request)
    return redirect('login')


@login_required()
def home(request):
    notes = Notatki.objects.filter(user=request.user)
    if request.method == 'POST':
        form = NotatkiForm(request.POST)
        if form.is_valid():
            note = form.save(commit=False)
            note.user = request.user
            note.save()
            return redirect('home')
    else:
        form = NotatkiForm()
    return render(request, 'home.html', {'notes': notes, 'form': form})

@login_required
def delete_note(request, note_id):
    note = Notatki.objects.get(id=note_id, user=request.user)
    note.delete()
    return redirect('home')
