from django.db import models
from django.contrib.auth.models import User


class Notatki(models.Model):
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    text = models.TextField()

